
  package gen;
  public class T_Gen35 {
  		@com.google.inject.Inject
  		public T_Gen35(T_Gen36 t_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  