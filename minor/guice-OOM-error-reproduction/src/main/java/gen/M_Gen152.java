
  package gen;
  public class M_Gen152 {
  		@com.google.inject.Inject
  		public M_Gen152(M_Gen153 m_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  