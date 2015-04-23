
  package gen;
  public class R_Gen186 {
  		@com.google.inject.Inject
  		public R_Gen186(R_Gen187 r_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  