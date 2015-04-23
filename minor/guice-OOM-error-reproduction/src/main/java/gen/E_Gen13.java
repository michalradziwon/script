
  package gen;
  public class E_Gen13 {
  		@com.google.inject.Inject
  		public E_Gen13(E_Gen14 e_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  