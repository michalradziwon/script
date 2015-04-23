
  package gen;
  public class E_Gen152 {
  		@com.google.inject.Inject
  		public E_Gen152(E_Gen153 e_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  