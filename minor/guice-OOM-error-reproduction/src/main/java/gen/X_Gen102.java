
  package gen;
  public class X_Gen102 {
  		@com.google.inject.Inject
  		public X_Gen102(X_Gen103 x_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  