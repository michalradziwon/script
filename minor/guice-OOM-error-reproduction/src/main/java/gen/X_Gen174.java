
  package gen;
  public class X_Gen174 {
  		@com.google.inject.Inject
  		public X_Gen174(X_Gen175 x_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  