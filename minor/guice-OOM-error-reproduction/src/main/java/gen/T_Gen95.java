
  package gen;
  public class T_Gen95 {
  		@com.google.inject.Inject
  		public T_Gen95(T_Gen96 t_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  