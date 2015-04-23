
  package gen;
  public class H_Gen186 {
  		@com.google.inject.Inject
  		public H_Gen186(H_Gen187 h_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  