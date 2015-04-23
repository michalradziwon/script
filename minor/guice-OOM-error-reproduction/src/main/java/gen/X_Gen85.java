
  package gen;
  public class X_Gen85 {
  		@com.google.inject.Inject
  		public X_Gen85(X_Gen86 x_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  