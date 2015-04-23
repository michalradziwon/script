
  package gen;
  public class M_Gen34 {
  		@com.google.inject.Inject
  		public M_Gen34(M_Gen35 m_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  