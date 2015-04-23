
  package gen;
  public class E_Gen175 {
  		@com.google.inject.Inject
  		public E_Gen175(E_Gen176 e_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  