
  package gen;
  public class M_Gen15 {
  		@com.google.inject.Inject
  		public M_Gen15(M_Gen16 m_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  