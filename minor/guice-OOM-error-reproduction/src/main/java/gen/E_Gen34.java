
  package gen;
  public class E_Gen34 {
  		@com.google.inject.Inject
  		public E_Gen34(E_Gen35 e_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  