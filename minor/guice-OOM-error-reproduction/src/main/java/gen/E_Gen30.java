
  package gen;
  public class E_Gen30 {
  		@com.google.inject.Inject
  		public E_Gen30(E_Gen31 e_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  