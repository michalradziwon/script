
  package gen;
  public class T_Gen3 {
  		@com.google.inject.Inject
  		public T_Gen3(T_Gen4 t_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  