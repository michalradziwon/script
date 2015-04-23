
  package gen;
  public class E_Gen15 {
  		@com.google.inject.Inject
  		public E_Gen15(E_Gen16 e_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  