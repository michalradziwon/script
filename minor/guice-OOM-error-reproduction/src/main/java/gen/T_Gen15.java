
  package gen;
  public class T_Gen15 {
  		@com.google.inject.Inject
  		public T_Gen15(T_Gen16 t_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  