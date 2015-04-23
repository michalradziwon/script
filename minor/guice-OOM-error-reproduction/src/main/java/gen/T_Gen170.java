
  package gen;
  public class T_Gen170 {
  		@com.google.inject.Inject
  		public T_Gen170(T_Gen171 t_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  