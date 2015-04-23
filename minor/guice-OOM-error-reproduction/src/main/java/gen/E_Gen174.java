
  package gen;
  public class E_Gen174 {
  		@com.google.inject.Inject
  		public E_Gen174(E_Gen175 e_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  