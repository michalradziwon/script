
  package gen;
  public class E_Gen94 {
  		@com.google.inject.Inject
  		public E_Gen94(E_Gen95 e_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  