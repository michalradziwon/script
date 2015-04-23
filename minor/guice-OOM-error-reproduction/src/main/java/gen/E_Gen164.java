
  package gen;
  public class E_Gen164 {
  		@com.google.inject.Inject
  		public E_Gen164(E_Gen165 e_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  