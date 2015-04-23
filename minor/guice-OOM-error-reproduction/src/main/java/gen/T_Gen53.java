
  package gen;
  public class T_Gen53 {
  		@com.google.inject.Inject
  		public T_Gen53(T_Gen54 t_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  