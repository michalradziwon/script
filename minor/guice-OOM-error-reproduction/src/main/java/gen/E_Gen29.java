
  package gen;
  public class E_Gen29 {
  		@com.google.inject.Inject
  		public E_Gen29(E_Gen30 e_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  