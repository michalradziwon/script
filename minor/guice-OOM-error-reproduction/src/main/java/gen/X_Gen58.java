
  package gen;
  public class X_Gen58 {
  		@com.google.inject.Inject
  		public X_Gen58(X_Gen59 x_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  