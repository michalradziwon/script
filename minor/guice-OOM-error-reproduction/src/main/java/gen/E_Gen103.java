
  package gen;
  public class E_Gen103 {
  		@com.google.inject.Inject
  		public E_Gen103(E_Gen104 e_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  