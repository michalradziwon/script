
  package gen;
  public class X_Gen22 {
  		@com.google.inject.Inject
  		public X_Gen22(X_Gen23 x_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  