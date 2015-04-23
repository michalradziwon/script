
  package gen;
  public class E_Gen146 {
  		@com.google.inject.Inject
  		public E_Gen146(E_Gen147 e_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  