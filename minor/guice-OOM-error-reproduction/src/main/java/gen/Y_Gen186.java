
  package gen;
  public class Y_Gen186 {
  		@com.google.inject.Inject
  		public Y_Gen186(Y_Gen187 y_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  