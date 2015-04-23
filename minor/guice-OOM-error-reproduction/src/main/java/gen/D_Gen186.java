
  package gen;
  public class D_Gen186 {
  		@com.google.inject.Inject
  		public D_Gen186(D_Gen187 d_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  