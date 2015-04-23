
  package gen;
  public class E_Gen4 {
  		@com.google.inject.Inject
  		public E_Gen4(E_Gen5 e_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  