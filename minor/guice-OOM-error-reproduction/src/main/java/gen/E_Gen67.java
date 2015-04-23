
  package gen;
  public class E_Gen67 {
  		@com.google.inject.Inject
  		public E_Gen67(E_Gen68 e_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  