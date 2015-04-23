
  package gen;
  public class E_Gen193 {
  		@com.google.inject.Inject
  		public E_Gen193(E_Gen194 e_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  