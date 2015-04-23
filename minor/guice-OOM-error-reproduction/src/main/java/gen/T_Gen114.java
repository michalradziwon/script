
  package gen;
  public class T_Gen114 {
  		@com.google.inject.Inject
  		public T_Gen114(T_Gen115 t_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  