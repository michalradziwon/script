
  package gen;
  public class E_Gen53 {
  		@com.google.inject.Inject
  		public E_Gen53(E_Gen54 e_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  