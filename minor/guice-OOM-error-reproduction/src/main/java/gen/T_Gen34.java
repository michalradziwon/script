
  package gen;
  public class T_Gen34 {
  		@com.google.inject.Inject
  		public T_Gen34(T_Gen35 t_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  