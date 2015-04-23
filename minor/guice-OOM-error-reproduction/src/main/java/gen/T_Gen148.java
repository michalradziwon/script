
  package gen;
  public class T_Gen148 {
  		@com.google.inject.Inject
  		public T_Gen148(T_Gen149 t_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  