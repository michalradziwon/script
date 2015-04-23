
  package gen;
  public class S_Gen186 {
  		@com.google.inject.Inject
  		public S_Gen186(S_Gen187 s_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  