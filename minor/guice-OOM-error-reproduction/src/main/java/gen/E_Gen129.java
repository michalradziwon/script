
  package gen;
  public class E_Gen129 {
  		@com.google.inject.Inject
  		public E_Gen129(E_Gen130 e_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  