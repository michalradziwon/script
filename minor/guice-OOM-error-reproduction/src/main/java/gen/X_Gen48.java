
  package gen;
  public class X_Gen48 {
  		@com.google.inject.Inject
  		public X_Gen48(X_Gen49 x_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  