
  package gen;
  public class X_Gen7 {
  		@com.google.inject.Inject
  		public X_Gen7(X_Gen8 x_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  