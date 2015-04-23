
  package gen;
  public class E_Gen186 {
  		@com.google.inject.Inject
  		public E_Gen186(E_Gen187 e_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  