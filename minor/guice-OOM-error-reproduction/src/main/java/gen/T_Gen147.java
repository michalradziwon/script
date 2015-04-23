
  package gen;
  public class T_Gen147 {
  		@com.google.inject.Inject
  		public T_Gen147(T_Gen148 t_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  