
  package gen;
  public class X_Gen43 {
  		@com.google.inject.Inject
  		public X_Gen43(X_Gen44 x_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  