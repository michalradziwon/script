
  package gen;
  public class M_Gen53 {
  		@com.google.inject.Inject
  		public M_Gen53(M_Gen54 m_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  