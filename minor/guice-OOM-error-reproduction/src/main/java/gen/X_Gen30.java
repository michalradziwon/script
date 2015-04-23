
  package gen;
  public class X_Gen30 {
  		@com.google.inject.Inject
  		public X_Gen30(X_Gen31 x_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  