
  package gen;
  public class T_Gen146 {
  		@com.google.inject.Inject
  		public T_Gen146(T_Gen147 t_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  