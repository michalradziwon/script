
  package gen;
  public class X_Gen186 {
  		@com.google.inject.Inject
  		public X_Gen186(X_Gen187 x_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  