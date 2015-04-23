
  package gen;
  public class E_Gen5 {
  		@com.google.inject.Inject
  		public E_Gen5(E_Gen6 e_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  