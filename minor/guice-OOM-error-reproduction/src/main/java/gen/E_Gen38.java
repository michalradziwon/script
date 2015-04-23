
  package gen;
  public class E_Gen38 {
  		@com.google.inject.Inject
  		public E_Gen38(E_Gen39 e_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  