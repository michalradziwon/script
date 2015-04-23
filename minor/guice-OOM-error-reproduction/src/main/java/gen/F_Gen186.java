
  package gen;
  public class F_Gen186 {
  		@com.google.inject.Inject
  		public F_Gen186(F_Gen187 f_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  