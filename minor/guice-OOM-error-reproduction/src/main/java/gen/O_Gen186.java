
  package gen;
  public class O_Gen186 {
  		@com.google.inject.Inject
  		public O_Gen186(O_Gen187 o_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  