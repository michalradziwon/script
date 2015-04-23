
  package gen;
  public class T_Gen113 {
  		@com.google.inject.Inject
  		public T_Gen113(T_Gen114 t_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  