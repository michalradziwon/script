
  package gen;
  public class X_Gen166 {
  		@com.google.inject.Inject
  		public X_Gen166(X_Gen167 x_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  