
  package gen;
  public class X_Gen175 {
  		@com.google.inject.Inject
  		public X_Gen175(X_Gen176 x_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  